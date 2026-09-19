SUMMARY = "Policy analysis graphical tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following graphical tools: \
 \
  apol          policy analysis tool"
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "setools-gui-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "cede88f8a69748f0a3364aa08a11106cc696517a6797ab7427adc169e0c7734149002373b21f0343b658fa1b2bd23127d95bec700e67914b6dd1d25131e49f7f"

RPROVIDES:${PN} += "setools-gui"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-PyQt6 \
python3-pygraphviz \
python3-setools"

inherit rpm
