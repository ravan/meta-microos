SUMMARY = "Utility to set the mode for an X Input device"
DESCRIPTION = "Xsetmode sets the mode of an XInput device to either absolute or \
relative."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "xsetmode-1.0.0-10.17.aarch64.rpm"
RPM_HASH = "f408fb3289aa3a84dc0f092015bb873471e86d2010477148d64f3987f57e012faad54050e288e564f770fc74f271f77f928ed268b82eec7158ade9412619e20f"

RPROVIDES:${PN} += "xsetmode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6"

inherit rpm
