SUMMARY = "A tool for inspecting low-level hardening characteristics of ELF binaries"
DESCRIPTION = "This package contains a Perl script that allows checking \
a number of hardening characteristics of ELF binaries. \
 \
This includes checks for: \
 \
- PIE executables \
- stack protection \
- source fortification macros \
- read-only relocations \
- immediate binding \
- branch protection"
LICENSE = "GPL-2.0-or-later"

PV = "2.25.19"

RPM_NAME = "hardening-check-2.25.19-1.4.aarch64.rpm"
RPM_HASH = "46fc1fef1a26f36fcafb4bbbdd9e1483e7f9580dcd9bcf06cb35273283893b82b8c3002197bc4aa06b5fa91d3f32a83f2312f14dee28580709d55479d4dd898f"

RPROVIDES:${PN} += "hardening-check"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
