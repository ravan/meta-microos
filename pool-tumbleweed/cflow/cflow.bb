SUMMARY = "Tool to generate flowcharts for C sources"
DESCRIPTION = "GNU cflow analyzes a collection of C source files and prints a graph, charting \
control flow within the program. GNU cflow is able to produce both direct and \
inverted flowgraphs for C sources. Optionally a cross-reference listing can be \
generated. Two output formats are implemented: POSIX and GNU (extended). Input \
files can optionally be preprocessed before analyzing."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "cflow-1.8-2.5.aarch64.rpm"
RPM_HASH = "67357bbd986a18a98027215bcee0764bbaa58257a2b4c20cdbe93dedaf69a2b0b5069bf5431a6feb1ad31c0872af693f2cb7e7b38190aa0796d1d4dc85b64de7"

RPROVIDES:${PN} += "cflow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
