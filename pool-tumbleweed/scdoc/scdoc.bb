SUMMARY = "A man page generator written in C99"
DESCRIPTION = "scdoc is a man page generator written for POSIX systems written in C99."
LICENSE = "MIT"

PV = "1.11.5"

RPM_NAME = "scdoc-1.11.5-1.2.aarch64.rpm"
RPM_HASH = "985de7935456e0d8a2860c0d1f77ebebc78e22de291fbfba59a1a81feb0d858200347c3f5ffa0d300edaaf9f6f7a5e5915f4734f312e8e79302b87aae543b0c0"

RPROVIDES:${PN} += "pkgconfig-scdoc \
scdoc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6"

inherit rpm
