SUMMARY = "Library of Web-Related Functions"
DESCRIPTION = "This is a Python library of web-related functions, such as: \
 \
* remove comments, or tags from HTML snippets \
 \
* extract base url from HTML snippets \
 \
* translate entites on HTML strings \
 \
* encoding mulitpart/form-data \
 \
* convert raw HTTP headers to dicts and vice-versa \
 \
* construct HTTP auth header \
 \
* converting HTML pages to unicode \
 \
* RFC-compliant url joining \
 \
* sanitize urls (like browsers do) \
 \
* extract arguments from urls"
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python313-w3lib-2.4.1-1.3.noarch.rpm"
RPM_HASH = "787ce5f9c1fa77f87535739ffe2f0c7df54e40b8450db69b06a06f1c825757fd2f30b35786f9527d12c6ef4c9f501e8971f55deec7cf35ee0dbbb0a009f8b844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-w3lib \
python3.13dist-w3lib \
python313-w3lib \
python3dist-w3lib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
