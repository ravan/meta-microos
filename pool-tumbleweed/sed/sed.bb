SUMMARY = "A Stream-Oriented Non-Interactive Text Editor"
DESCRIPTION = "Sed takes text input, performs one or more operations on it, and \
outputs the modified text. Sed is typically used for extracting parts \
of a file using pattern matching or  for substituting multiple \
occurrences of a string within a file."
LICENSE = "GPL-3.0-or-later"

PV = "4.10"

RPM_NAME = "sed-4.10-1.4.aarch64.rpm"
RPM_HASH = "79268e8461dc5caec8d48cc3647cc472183630ff456dd48e3661c67bbafa917c51fb64beec55581480e95450e62d975250b49c8847f9fe2aa99fe9e01928fcfe"

RPROVIDES:${PN} += "/usr/bin/sed \
base-/bin/sed \
sed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
