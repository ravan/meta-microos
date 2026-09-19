SUMMARY = "Redmine plugin for md2workflow"
DESCRIPTION = "Redmine plugin for md2workflow"
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python313-md2workflow-plugins-redmine-1.4.18-6.5.noarch.rpm"
RPM_HASH = "3b544fb7db7ce40d06b9650b8618d0e6a16c947d33b32afca595b44f4c2b7dfd4ff97c8f9e6af0be81016754e0344e6f1f16259c3c7d6ef68b952f33fd807634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-md2workflow-plugins-redmine \
python313-md2workflow-plugins-redmine"

RDEPENDS:${PN} += "python-abi \
python313-md2workflow \
python313-python-redmine"

inherit rpm
