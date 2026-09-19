SUMMARY = "Policy analysis command-line tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following console tools: \
 \
  seinfo          Provide information about policies \
  sesearch        Tool to query policies \
  sediff          Semantic policy difference tool"
LICENSE = "GPL-2.0-only"

PV = "4.7.1"

RPM_NAME = "setools-console-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "a4e976cf509095413a242d53d928708256e91c44e9ca0704fe26c03e970d53b14779907d5f796fa0c66ee19c18ed5b6d13058369b13d8b5d7cab35f012110c49"

RPROVIDES:${PN} += "setools-console"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-setools"

inherit rpm
