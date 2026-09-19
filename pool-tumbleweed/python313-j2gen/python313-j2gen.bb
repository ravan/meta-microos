SUMMARY = "Jinja2 template renderer with yaml input files"
DESCRIPTION = "Jinja2 template renderer with yaml input files"
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python313-j2gen-0.1.0-5.5.noarch.rpm"
RPM_HASH = "a8176cae26ae207ec4c4e63e6b83b5520886c413825513ef9682bff4d341b1fd6b7286702f5deb51526776ff8dddf2b2dbe76d7ac7b7ec92123aeea2c4e5bb34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-j2gen \
python3.13dist-j2gen \
python313-j2gen \
python3dist-j2gen"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Jinja2 \
python313-PyYAML"

inherit rpm
