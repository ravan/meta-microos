SUMMARY = "Development files for notmuch"
DESCRIPTION = "The notmuch-devel package contains libraries and header files for \
developing applications that use notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "notmuch-devel-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "acdcecd2227b809fb4238bddd5cd40c38f78b56ce6fc5db936dd9b89a3af1c84e07ddca6eef4a0ac454f65165b735170e9093d6dc3be250658bc7ceba263d1af"

RPROVIDES:${PN} += "notmuch-devel"

RDEPENDS:${PN} += "libnotmuch5"

inherit rpm
