SUMMARY = "JsonDecoder for ndjson"
DESCRIPTION = "JsonDecoder for ndjson"
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "python313-ndjson-0.3.1-1.16.noarch.rpm"
RPM_HASH = "27e811981fd103d3ba2090c0ec1b46434231f814ae9a81f1487ccea6fdae527f20f61bfcaf75ea835b3d5c750619dde112ecd1238c5f88a5b21f19e7141596ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndjson \
python3.13dist-ndjson \
python313-ndjson \
python3dist-ndjson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
