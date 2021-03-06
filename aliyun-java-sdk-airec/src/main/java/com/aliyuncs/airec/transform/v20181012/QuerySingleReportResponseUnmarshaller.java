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

import com.aliyuncs.airec.model.v20181012.QuerySingleReportResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySingleReportResponseUnmarshaller {

	public static QuerySingleReportResponse unmarshall(QuerySingleReportResponse querySingleReportResponse, UnmarshallerContext _ctx) {
		
		querySingleReportResponse.setRequestId(_ctx.stringValue("QuerySingleReportResponse.RequestId"));
		querySingleReportResponse.setCode(_ctx.stringValue("QuerySingleReportResponse.Code"));
		querySingleReportResponse.setMessage(_ctx.stringValue("QuerySingleReportResponse.Message"));
		querySingleReportResponse.setResult(_ctx.mapValue("QuerySingleReportResponse.Result"));
	 
	 	return querySingleReportResponse;
	}
}