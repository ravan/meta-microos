SUMMARY = "Move/Copy/Append/Link Multiple Files by Wildcard Patterns"
DESCRIPTION = "Mmv moves (or copies, appends, or links, as specified) each source file matching \
a from pattern to the target name specified by the to pattern.  This multiple \
action is performed safely, i.e. without any unexpected deletion of files due to \
collisions of target names with existing filenames or with other target names. \
Furthermore, before doing anything, mmv attempts to detect any errors that would \
result from the entire set of actions specified and gives the user the choice of \
either proceeding by avoiding the offending parts or aborting."
LICENSE = "GPL-1.0-or-later"

PV = "2.10"

RPM_NAME = "mmv-2.10-1.7.aarch64.rpm"
RPM_HASH = "89a449198d190840488ad4159bccfad50a93247d805916074461055886a6dc804150282bb1093f07207cb9555b63a35bb8139f08256c1e9a6077d4819d0aefa3"

RPROVIDES:${PN} += "mmv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
