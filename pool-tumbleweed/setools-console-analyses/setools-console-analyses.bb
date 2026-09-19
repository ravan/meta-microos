SUMMARY = "Policy analysis command-line tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following console tools: \
 \
  sedta        Perform domain transition analyses. \
  seinfoflow   Perform information flow analyses."
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "setools-console-analyses-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "8ff4110002c204cbc4b08371c6ff5255744c791c971ac64e135f7d7aefa16f5eb3376f75af0bbbadefc7d8b1a3200544b2da59bd883eabd3c3429bf01c819aad"

RPROVIDES:${PN} += "setools-console-analyses"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-networkx \
python3-setools"

inherit rpm
