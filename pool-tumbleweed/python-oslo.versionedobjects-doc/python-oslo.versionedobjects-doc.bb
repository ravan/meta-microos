SUMMARY = "osloversionedobjects library - Documentation"
DESCRIPTION = "This package contains documentation files for python-oslo.versionedobjects."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python-oslo.versionedobjects-doc-3.11.0-1.1.noarch.rpm"
RPM_HASH = "5dc93976eead589062ab5e2dbf2f75e9a8980afb9a1ecccbd93ef47a19a9f80c96eaa05dfb5e5e874eae666bc4c4f67f4f297ee066dc87ba9c632c25406b2231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.versionedobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm
