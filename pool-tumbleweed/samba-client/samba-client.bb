SUMMARY = "Samba Client Utilities"
DESCRIPTION = "Samba is a suite of programs that allows SMB/CIFS clients to use the \
Unix file space, printers, and authentication subsystem. \
 \
The package named samba-client contains all programs that are needed to \
act as a Samba client. The binaries expect the configuration file to \
be found in /etc/samba/smb.conf \
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

RPM_NAME = "samba-client-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "6c13429e98765e63a2652a83a5b6d8a502059215436dea8f5f2467da0bbc689dc971442a0fe432fb3f829ba74e54deca1fef802ef309e3ab2983fbb6d41e9742"

RPROVIDES:${PN} += "config-samba-client \
libnss-wins.so.2 \
samba-client \
smbfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libCHARSET3-private-samba.so \
libaddns-private-samba.so \
libads-private-samba.so \
libarchive.so.13 \
libauth-private-samba.so \
libc.so.6 \
libcli-cldap-private-samba.so \
libcli-ldap-private-samba.so \
libcli-smb-common-private-samba.so \
libcli-spoolss-private-samba.so \
libcliauth-private-samba.so \
libcmdline-contexts-private-samba.so \
libcmdline-private-samba.so \
libcom-err.so.2 \
libcommon-auth-private-samba.so \
libdbwrap-private-samba.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libevents-private-samba.so \
libflag-mapping-private-samba.so \
libform.so.6 \
libgenrand-private-samba.so \
libgensec-private-samba.so \
libgnutls.so.30 \
libgpo-private-samba.so \
libgse-private-samba.so \
libjansson.so.4 \
libkrb5.so.3 \
libkrb5samba-private-samba.so \
libldap.so.2 \
libldb.so.2 \
libldbsamba-private-samba.so \
liblibcli-lsa3-private-samba.so \
liblibcli-netlogon3-private-samba.so \
liblibsmb-private-samba.so \
libmscat-private-samba.so \
libmsrpc3-private-samba.so \
libncurses.so.6 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr-samba-private-samba.so \
libndr-samba4-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libnet-keytab-private-samba.so \
libnetapi.so.1 \
libpanel.so.6 \
libpopt.so.0 \
libprinting-migrate-private-samba.so \
libreadline.so.8 \
libregistry-private-samba.so \
libreplace-private-samba.so \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-passdb.so.0 \
libsamba-security-private-samba.so \
libsamba-sockets-private-samba.so \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libsecrets3-private-samba.so \
libserver-id-db-private-samba.so \
libserver-role-private-samba.so \
libsmbclient-raw-private-samba.so \
libsmbclient.so.0 \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libsmbd-shim-private-samba.so \
libsmbldap.so.2 \
libsocket-blocking-private-samba.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
libtinfo.so.6 \
libutil-reg-private-samba.so \
libutil-tdb-private-samba.so \
libwbclient.so.0"

inherit rpm
