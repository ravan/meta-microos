SUMMARY = "SUSE Linux Base Package (Windows Subsystem for Linux)"
DESCRIPTION = "This package includes some special settings needed on Windows Subsystem \
for Linux. It should only be installed on WSL and not on regular Linux \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20260610.3b5a868c"

RPM_NAME = "aaa_base-wsl-84.87+git20260610.3b5a868c-1.3.aarch64.rpm"
RPM_HASH = "e0e0faaddcf40c18542a061091676c1608faef22d02d8c852d6c667df927f880ff7395a622c2e8c49bad4587e133b83f0cadee603821384cbed19615312a55c3"

RPROVIDES:${PN} += "aaa-base-wsl"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
