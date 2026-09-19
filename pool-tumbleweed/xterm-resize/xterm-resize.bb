SUMMARY = "Set environment and terminal settings to current window size"
DESCRIPTION = "Prints a shell command for setting the appropriate environment variables to \
indicate the current size of the window from which the command is run."
LICENSE = "MIT"

PV = "410"

RPM_NAME = "xterm-resize-410-1.3.aarch64.rpm"
RPM_HASH = "91db6175b578f7446326c6bb9d0feeb10b2c2023bd4610516acf469384088f3888e28534ab12b7f6701c7a8d30abc37dccb561e4ef396146e079d1c451243d3b"

RPROVIDES:${PN} += "xterm-resize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
