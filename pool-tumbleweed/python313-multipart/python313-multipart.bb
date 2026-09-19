SUMMARY = "Parser for multipart/form-data"
DESCRIPTION = "This module provides multiple parsers for RFC-7578 multipart/form-data, both \
low-level for framework authors and high-level for WSGI application developers: \
 \
* PushMultipartParser: A low-level incremental SansIO <https://sans-io.readthedocs.io/> \
  (non-blocking) parser suitable for asyncio and other time or memory constrained \
  environments. \
* MultipartParser: A streaming parser emitting memory- and disk-buffered \
  MultipartPart instances. \
* parse_form_data: A helper function to parse both multipart/form-data \
  and application/x-www-form-urlencoded form submissions from a \
  WSGI environment."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-multipart-1.3.1-1.3.noarch.rpm"
RPM_HASH = "56b97f84b310dee72e247201f8a013007e5a5d035c7a3286eac3ea359b1dfbcb22bd208661c0aaadab37aefd2662599b097240df525d45ab520a336965029e9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multipart \
python3.13dist-multipart \
python313-multipart \
python3dist-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
