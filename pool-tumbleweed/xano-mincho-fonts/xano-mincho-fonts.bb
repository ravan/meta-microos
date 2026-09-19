SUMMARY = "Japanese 'XANO-Mincho-U32' TrueType font JIS X 0213:2004"
DESCRIPTION = "Japanese 'XANO-Mincho-U32' TrueType font JIS X 0213:2004"
LICENSE = "SUSE-Xano"

PV = "20040509"

RPM_NAME = "xano-mincho-fonts-20040509-11.27.noarch.rpm"
RPM_HASH = "f61fe3bd16192acd775b23461fe10682c74172ed0b908f091f0a2b137ec095d4946b95cb4e6a93d84c591ff9fe2919abc3e52f888c35b973b5a2fcad1feeb631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ja \
scalable-font-ja \
xano-mincho \
xano-mincho-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
