SUMMARY = "Security focused Peer-to-Peer Framework"
DESCRIPTION = "GNUnet is peer-to-peer framework focusing on security. The first and primary \
application for GNUnet is anonymous file-sharing. GNUnet is currently developed \
by a worldwide group of independent free software developers. \
 \
GNUnet is a part of the GNU project (https://www.gnu.org/)."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "gnunet-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "f76707c1c90c6cd751eba1c0fcbd596e50be747dd09defbe80904fd3bf63eca00d2d413fe945722591f73eb8addced912c698d7ff25879970a80d8fcfef78de3"

RPROVIDES:${PN} += "gnunet \
group-gnunet \
group-gnunetdns \
libgnunet-plugin-block-consensus.so \
libgnunet-plugin-block-dht.so \
libgnunet-plugin-block-dns.so \
libgnunet-plugin-block-fs.so \
libgnunet-plugin-block-gns.so \
libgnunet-plugin-block-regex.so \
libgnunet-plugin-block-revocation.so \
libgnunet-plugin-block-set-test.so \
libgnunet-plugin-block-seti-test.so \
libgnunet-plugin-block-setu-test.so \
libgnunet-plugin-block-test.so \
libgnunet-plugin-datacache-heap.so \
libgnunet-plugin-datacache-postgres.so \
libgnunet-plugin-datacache-sqlite.so \
libgnunet-plugin-datastore-heap.so \
libgnunet-plugin-datastore-postgres.so \
libgnunet-plugin-datastore-sqlite.so \
libgnunet-plugin-gnsrecord-dns.so \
libgnunet-plugin-gnsrecord-gns.so \
libgnunet-plugin-gnsrecord-messenger.so \
libgnunet-plugin-gnsrecord-reclaim.so \
libgnunet-plugin-namecache-flat.so \
libgnunet-plugin-namecache-postgres.so \
libgnunet-plugin-namecache-sqlite.so \
libgnunet-plugin-namestore-postgres.so \
libgnunet-plugin-namestore-sqlite.so \
libgnunet-plugin-peerstore-sqlite.so \
libgnunet-plugin-reclaim-attribute-basic.so \
libgnunet-plugin-reclaim-credential-jwt.so \
user-gnunet"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/openssl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libgnunetabd.so.0 \
libgnunetarm.so.2 \
libgnunetblock.so.0 \
libgnunetblockgroup.so.0 \
libgnunetcadet.so.7 \
libgnunetconsensus.so.0 \
libgnunetcore.so.0 \
libgnunetdatacache.so.0 \
libgnunetdatastore.so.1 \
libgnunetdht.so.4 \
libgnunetdid.so.0 \
libgnunetdns.so.0 \
libgnunetfs.so.2 \
libgnunetgns.so.0 \
libgnunetgnsrecord.so.0 \
libgnunetgnsrecordjson.so.0 \
libgnunethello.so.0 \
libgnunetidentity.so.1 \
libgnunetjson.so.3 \
libgnunetmessenger.so.0 \
libgnunetnamecache.so.0 \
libgnunetnamestore.so.0 \
libgnunetnatauto.so.0 \
libgnunetnatnew.so.2 \
libgnunetnse.so.0 \
libgnunetpeerstore.so.0 \
libgnunetpils.so.0 \
libgnunetpq.so.5 \
libgnunetreclaim.so.0 \
libgnunetregex.so.3 \
libgnunetregexblock.so.1 \
libgnunetrest.so.0 \
libgnunetrevocation.so.0 \
libgnunetrps.so.0 \
libgnunetscalarproduct.so.0 \
libgnunetset.so.0 \
libgnunetseti.so.0 \
libgnunetsetu.so.0 \
libgnunetsq.so.0 \
libgnunetstatistics.so.2 \
libgnunettestbed.so.0 \
libgnunettesting.so.3 \
libgnunettransportapplication.so.0 \
libgnunettransportcommunicator.so.0 \
libgnunettransportcore.so.0 \
libgnunetutil.so.20 \
libgnunetvpn.so.0 \
libgnutls.so.30 \
libidn2.so.0 \
libjansson.so.4 \
libm.so.6 \
libmicrohttpd.so.12 \
libsodium.so.26 \
libsqlite3.so.0 \
libzbar.so.0 \
mozilla-nss-tools \
sysuser-shadow"

inherit rpm
