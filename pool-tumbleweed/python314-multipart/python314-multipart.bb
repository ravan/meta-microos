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

RPM_NAME = "python314-multipart-1.3.1-1.3.noarch.rpm"
RPM_HASH = "1829885fb4dfbf16dc92a3dc2a2750196ba0376a37afeaf198e3beeb8dbb29351d753184089fa1346a6174fa8b26017815df3f9937c722712bb0f89fcc989d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-multipart \
python314-multipart \
python3dist-multipart"

RDEPENDS:${PN} += "python-abi"

inherit rpm
