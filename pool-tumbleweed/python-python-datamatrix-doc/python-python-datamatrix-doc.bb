SUMMARY = "Documentation for python-python-datamatrix"
DESCRIPTION = "Documentation and examples for python-python-datamatrix."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.19"

RPM_NAME = "python-python-datamatrix-doc-1.0.19-1.3.noarch.rpm"
RPM_HASH = "e1346b9877fbf9022d696e0dd84578ec244a4e3de3b7ffb1b90455a40e9264f5f2710274f89a1bbd233fda390477a7bb99aba4410a33ee7f575870ba80d6b908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-python-datamatrix-doc \
python313-python-datamatrix-doc \
python314-python-datamatrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
