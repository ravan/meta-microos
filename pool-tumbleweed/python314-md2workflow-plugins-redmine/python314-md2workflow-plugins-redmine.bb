SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python314-md2workflow-plugins-redmine-1.4.18-6.5.noarch.rpm"
RPM_HASH = "cc8b7ec6cd9f72bb94c5c1632b147e69441a0c0edf82b1277fea62f1fa4a5c207c1a5661294419ebfeff5be340ac00e510a3c128ef975c897099b5e00a3d6e6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python314-md2workflow \
python314-python-redmine"

inherit rpm
