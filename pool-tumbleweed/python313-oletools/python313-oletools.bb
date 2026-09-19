SUMMARY = "Tools to analyze security characteristics of MS Office and OLE files"
DESCRIPTION = "Python tools to analyze security characteristics of MS Office and OLE files (also called Structured Storage, Compound File Binary Format or Compound Document File Format), for Malware Analysis and Incident Response (DFIR)"
LICENSE = "BSD-2-Clause & MIT"

PV = "0.60.2"

RPM_NAME = "python313-oletools-0.60.2-2.5.noarch.rpm"
RPM_HASH = "73c313419b5f8d655ec51b32435ccc7230cf0bb76c4890d894833726d6515fd5b22bb05720df7a9ef5a0d8cfc7e8b3cdf2c7883449b8ba96e7caaef6aa17d2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oletools \
python3.13dist-oletools \
python313-oletools \
python3dist-oletools"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-colorclass \
python313-easygui \
python313-msoffcrypto-tool \
python313-olefile \
python313-pyparsing \
update-alternatives"

inherit rpm
