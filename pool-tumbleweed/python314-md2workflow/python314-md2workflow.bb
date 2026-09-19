SUMMARY = "Tool to create a JIRA or other Workflow from markdown files"
DESCRIPTION = "A tool which can convert typically 'VCS managed' mardown checklist \
into e.g. a linked structure of Jira Epics. This tool can not only \
create checklists, but also update them."
LICENSE = "GPL-3.0-only"

PV = "1.4.18"

RPM_NAME = "python314-md2workflow-1.4.18-6.5.noarch.rpm"
RPM_HASH = "26507a338ccee101656c064c5d323474938e58fb2a220d21059069f3768b3cd12ded57726904d20f8cb331bdd45c604e100f0bc66e14f90fb847d953b798f8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "md2workfow \
python3.14dist-md2workflow \
python314-md2workflow \
python3dist-md2workflow"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-icalendar \
python314-md2workflow-common"

inherit rpm
