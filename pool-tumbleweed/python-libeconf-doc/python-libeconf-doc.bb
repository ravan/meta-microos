SUMMARY = "Man page for python-libeconf"
DESCRIPTION = "Man page for python-lineconf"
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python-libeconf-doc-0.8.4-1.1.noarch.rpm"
RPM_HASH = "e4fefc148b05e1fae7409980f2166230b522d0ab1fb482fc63f81bed46e05cef2958b58f0e7a9aa3e1c139b2a0531b33584e0bfba253d69ed8c82012efdcc067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-libeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
