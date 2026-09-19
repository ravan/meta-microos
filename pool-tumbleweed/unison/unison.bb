SUMMARY = "File synchronization tool"
DESCRIPTION = "Graphical userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0-or-later"

PV = "2.54.0"

RPM_NAME = "unison-2.54.0-1.1.aarch64.rpm"
RPM_HASH = "92908c2b0089904e5cc9ea5333cdd5dbb0e7c4601e3e5edd4f975cfc2979ae112cded57b8ea9fc9e5ea4115032a6e372663d2b64004fff2912ec501638c7acf3"

RPROVIDES:${PN} += "unison"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
