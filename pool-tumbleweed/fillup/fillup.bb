SUMMARY = "Tool for Merging Config Files"
DESCRIPTION = "fillup merges files that hold variables.  A variable is defined by an \
entity composed of a preceding comment, a variable name, an assignment \
delimiter, and a related variable value.  A variable is determined by \
its variable name."
LICENSE = "GPL-2.0-or-later"

PV = "1.42"

RPM_NAME = "fillup-1.42-281.9.aarch64.rpm"
RPM_HASH = "601f29f5281e8c7f22251a7fe6ae22f469a672b2208b34ef0d76c99cb1ddfd15690d1a4c8a055dc73239e38a51249b18a6c94ecd7a43a3d4f8a0d0a57dcf00ce"

RPROVIDES:${PN} += "aaa-base-/bin/fillup \
fillup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
