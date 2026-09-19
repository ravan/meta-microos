SUMMARY = "A GUI FTP and SFTP Client"
DESCRIPTION = "FileZilla is a modern and powerful FTP client. \
FileZilla development focuses on high usability while also \
supporting as many useful features as possible. \
 \
Some of the main features are: \
 * Continuing interrupted up-/downloads. \
 * Managing different FTP sites. \
 * Modifiable Commands. \
 * Keep-Alive-System. \
 * Timeout detection. \
 * Firewall support. \
 * SOCKS4/5 and HTTP 1.1 proxy support. \
 * SSL support (secure connections). \
 * SFTP support. \
 * Upload/Download queue. \
 * Drag&Drop support."
LICENSE = "GPL-2.0-or-later"

PV = "3.71.1"

RPM_NAME = "filezilla-3.71.1-1.1.aarch64.rpm"
RPM_HASH = "ce3af941aef711a41cac472e3f18c3f9072af617dc376da17a4c05970d7ebb54934af3d03fd4b207ef980ad6d0ed632e3852c5a56e191d4667c25e731df73327"

RPROVIDES:${PN} += "filezilla \
libfzclient-commonui-private-3.71.1.so \
libfzclient-private-3.71.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfilezilla.so.59 \
libfzssh-client.so.14.0.0 \
libfzssh.so.14.0.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpugixml.so.1 \
libpugixml1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse.so.16.0.0"

inherit rpm
