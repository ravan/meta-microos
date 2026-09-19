SUMMARY = "Utility to create dependencies in makefiles"
DESCRIPTION = "The makedepend program reads each sourcefile in sequence and parses it \
like a C-preprocessor so that it can correctly tell which #include \
directives would be used in a compilation. \
 \
These dependencies are then written to a makefile in such a way that \
make will know which object files must be recompiled when a dependency \
has changed."
LICENSE = "MIT"

PV = "1.0.10"

RPM_NAME = "makedepend-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "fbc8b3dab4c7c37c6238da5cc818bc5c2091e8a69449a013f8768065315bcf6c231e742a341908a20336e652aaaa1b05bf1149c833804af607ebc28ce775271e"

RPROVIDES:${PN} += "makedepend"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
