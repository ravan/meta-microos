SUMMARY = "Code coverage tool without special compilation options"
DESCRIPTION = "Kcov is a code coverage tester for compiled programs, Python scripts and shell \
scripts.  It allows collecting code coverage information from executables \
without special command-line arguments, and continuously produces output from \
long-running applications."
LICENSE = "APSL-2.0 & GPL-2.0-only"

PV = "42"

RPM_NAME = "kcov-42-4.5.aarch64.rpm"
RPM_HASH = "fcecde63ae803472c2f0ef0edf6f3e0d15de4966f8f57fd809a2e95e8ba5ef61c24b18c69676de9120b00ba3a669af3868c79d25317a3dd96e173de7f52b8114"

RPROVIDES:${PN} += "kcov"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
