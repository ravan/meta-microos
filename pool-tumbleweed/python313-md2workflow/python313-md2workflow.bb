SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python313-md2workflow-1.4.18-6.5.noarch.rpm"
RPM_HASH = "9e784faedcad6a11f6cacecc520d29a9c106346e5dbd988f542b33802debc36a652ac23b1e324f0ea21dfe77cfcf48cbff64fcf170dfdb0d132d836915c63ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3-md2workflow \
python3.13dist-md2workflow \
python313-md2workflow \
python3dist-md2workflow"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-icalendar \
python313-md2workflow-common"

inherit rpm
