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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.UpgradeInstanceResponse;
import com.aliyuncs.airec.model.v20181012.UpgradeInstanceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeInstanceResponseUnmarshaller {

	public static UpgradeInstanceResponse unmarshall(UpgradeInstanceResponse upgradeInstanceResponse, UnmarshallerContext _ctx) {
		
		upgradeInstanceResponse.setRequestId(_ctx.stringValue("UpgradeInstanceResponse.RequestId"));
		upgradeInstanceResponse.setCode(_ctx.stringValue("UpgradeInstanceResponse.Code"));
		upgradeInstanceResponse.setMessage(_ctx.stringValue("UpgradeInstanceResponse.Message"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("UpgradeInstanceResponse.Result.InstanceId"));
		upgradeInstanceResponse.setResult(result);
	 
	 	return upgradeInstanceResponse;
	}
}