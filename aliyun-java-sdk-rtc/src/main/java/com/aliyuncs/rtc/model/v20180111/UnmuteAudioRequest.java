/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UnmuteAudioRequest extends RpcAcsRequest<UnmuteAudioResponse> {
	
	public UnmuteAudioRequest() {
		super("rtc", "2018-01-11", "UnmuteAudio", "rtc");
	}

	private List<String> participantIdss;

	private Long ownerId;

	private String conferenceId;

	private String appId;

	public List<String> getParticipantIdss() {
		return this.participantIdss;
	}

	public void setParticipantIdss(List<String> participantIdss) {
		this.participantIdss = participantIdss;	
		if (participantIdss != null) {
			for (int i = 0; i < participantIdss.size(); i++) {
				putQueryParameter("ParticipantIds." + (i + 1) , participantIdss.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getConferenceId() {
		return this.conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
		if(conferenceId != null){
			putQueryParameter("ConferenceId", conferenceId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<UnmuteAudioResponse> getResponseClass() {
		return UnmuteAudioResponse.class;
	}

}