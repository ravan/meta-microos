SUMMARY = "Python HTTP Library"
DESCRIPTION = "Requests is an HTTP library, written in Python, as an alternative \
to Python's builtin urllib2 which requires work (even \
method overrides) to perform basic tasks. \
 \
Features of Requests: \
 - GET, HEAD, POST, PUT, DELETE Requests: \
   + HTTP Header Request Attachment. \
   + Data/Params Request Attachment. \
   + Multipart File Uploads. \
   + CookieJar Support. \
   + Redirection History. \
   + Redirection Recursion Urllib Fix. \
   + Automatic Decompression of GZipped Content. \
   + Unicode URL Support. \
 - Authentication: \
   + URL + HTTP Auth Registry."
LICENSE = "Apache-2.0"

PV = "2.34.2"

RPM_NAME = "python314-requests-2.34.2-1.2.noarch.rpm"
RPM_HASH = "074b5c4b3aa4e015176967e3dcbfe6ab0f5f8ccf435ac2db0e74144b483222cf5f0989ed5071f1f83ba9001afb7ed3f4dc2e0f11aef6e2dd8eb8391dcd800f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests \
python314-requests \
python3dist-requests"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python314 \
python314-certifi \
python314-charset-normalizer \
python314-idna \
python314-urllib3"

inherit rpm
