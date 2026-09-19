SUMMARY = "The system GNU Modula-2 Compiler"
DESCRIPTION = "The system GNU Modula-2 Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-m2-16-1.1.aarch64.rpm"
RPM_HASH = "fe68d31ca406f074d6758b0c4653d6c50626723c9239d6be0cae338f15742229d21b14ea891a73bb487b802a5dadc46c5c2acf01a41d4b8618fcccbc75e834f6"

RPROVIDES:${PN} += "gcc-m2"

RDEPENDS:${PN} += "gcc \
gcc16-m2"

inherit rpm
