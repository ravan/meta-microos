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

RPM_NAME = "python313-requests-2.34.2-1.2.noarch.rpm"
RPM_HASH = "d619600c270ae7887b56d94e32c2115bc347d53f394d498950b7db05919458518016bdcab41447c6c588e3436c9b573428bdab47c22efaa6de4eea983a7be375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests \
python3.13dist-requests \
python313-requests \
python3dist-requests"

RDEPENDS:${PN} += "ca-certificates \
python-abi \
python313 \
python313-certifi \
python313-charset-normalizer \
python313-idna \
python313-urllib3"

inherit rpm
