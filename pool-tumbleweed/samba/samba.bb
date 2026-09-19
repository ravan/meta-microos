SUMMARY = "A SMB/CIFS File, Print, and Authentication Server"
DESCRIPTION = "Samba is a suite of programs that allows SMB/CIFS clients to use the \
Unix file space, printers, and authentication subsystem. \
 \
The package named samba contains all programs that are needed to act as \
a server.  The binaries expect the configuration file to be found in \
/etc/samba/smb.conf \
 \
For a more detailed description of Samba, check the samba-doc package \
or the Samba.org Web page at https://www.Samba.org/ \
 \
Please check https://en.openSUSE.org/Samba for general information on \
Samba as part of SUSE Linux Enterprise or openSUSE products, links to \
binary packages of the most current Samba version, and a bug reporting \
how to."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "3d8b19e52a1d5e6f9e2863d9667d8730c210b4da87b44ad7ef6ab8f0575ac8f38d366f4bb9ef8744b8c6e73610377b72d1c282233e63ac923980f901d7045272"

RPROVIDES:${PN} += "config-samba \
group-ntadmin \
samba"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
group-users \
ld-linux-aarch64.so.1 \
libCHARSET3-private-samba.so \
libMESSAGING-private-samba.so \
libREG-FULL-private-samba.so \
libRPC-SERVER-LOOP-private-samba.so \
libads-private-samba.so \
libauth-private-samba.so \
libauth4-private-samba.so \
libauthkrb5-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-nbt-private-samba.so \
libcli-smb-common-private-samba.so \
libcli-spoolss-private-samba.so \
libcliauth-private-samba.so \
libcmdline-contexts-private-samba.so \
libcmdline-private-samba.so \
libcommon-auth-private-samba.so \
libcups.so.2 \
libdbus-1.so.3 \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc-server-core.so.0 \
libevents-private-samba.so \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgse-private-samba.so \
libldap.so.2 \
liblibsmb-private-samba.so \
libmessages-dgm-private-samba.so \
libmsghdr-private-samba.so \
libmsrpc3-private-samba.so \
libndr-nbt.so.0 \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libpopt.so.0 \
libposix-eadb-private-samba.so \
libprinting-migrate-private-samba.so \
libreplace-private-samba.so \
libsamba-cluster-support-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsecrets3-private-samba.so \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libsmbd-shim-private-samba.so \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
liburing.so.2 \
libutil-reg-private-samba.so \
libutil-tdb-private-samba.so \
libxattr-tdb-private-samba.so \
samba-client \
samba-dcerpc \
system-user-nobody \
sysuser-shadow"

inherit rpm
