SUMMARY = "Security focused Peer-to-Peer Framework"
DESCRIPTION = "GNUnet is peer-to-peer framework focusing on security. The first and primary \
application for GNUnet is anonymous file-sharing. GNUnet is currently developed \
by a worldwide group of independent free software developers. \
 \
This package contains header files and libraries needed to develop \
application that use gnunet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "gnunet-devel-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "935897b999d55ba7d5d2961e9a8a38ded8e3c4403276d065c56c73d71f0424a63f4c31d67be0aca9928bdacdc14576f0e01cfae396c26ff04828ff95c845a8bd"

RPROVIDES:${PN} += "gnunet-devel \
pkgconfig-gnunetabd \
pkgconfig-gnunetarm \
pkgconfig-gnunetblock \
pkgconfig-gnunetcadet \
pkgconfig-gnunetconsensus \
pkgconfig-gnunetcore \
pkgconfig-gnunetdatacache \
pkgconfig-gnunetdatastore \
pkgconfig-gnunetdht \
pkgconfig-gnunetdid \
pkgconfig-gnunetdns \
pkgconfig-gnunetfs \
pkgconfig-gnunetgns \
pkgconfig-gnunetgnsrecord \
pkgconfig-gnunethello \
pkgconfig-gnunetidentity \
pkgconfig-gnunetjson \
pkgconfig-gnunetmessenger \
pkgconfig-gnunetmhd \
pkgconfig-gnunetnamecache \
pkgconfig-gnunetnamestore \
pkgconfig-gnunetnat \
pkgconfig-gnunetnatauto \
pkgconfig-gnunetnse \
pkgconfig-gnunetpeerstore \
pkgconfig-gnunetpils \
pkgconfig-gnunetreclaim \
pkgconfig-gnunetregex \
pkgconfig-gnunetrest \
pkgconfig-gnunetrevocation \
pkgconfig-gnunetrps \
pkgconfig-gnunetscalarproduct \
pkgconfig-gnunetsecretsharing \
pkgconfig-gnunetset \
pkgconfig-gnunetseti \
pkgconfig-gnunetsetu \
pkgconfig-gnunetsq \
pkgconfig-gnunetstatistics \
pkgconfig-gnunettestbed \
pkgconfig-gnunettesting \
pkgconfig-gnunettransportapplication \
pkgconfig-gnunettransportcommunicator \
pkgconfig-gnunettransportcore \
pkgconfig-gnunettransportmonitor \
pkgconfig-gnunetutil \
pkgconfig-gnunetvpn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnunetabd0 \
libgnunetarm2 \
libgnunetblock0 \
libgnunetblockgroup0 \
libgnunetcadet7 \
libgnunetconsensus0 \
libgnunetcore0 \
libgnunetcoreunderlaydummy0 \
libgnunetcurl0 \
libgnunetdatacache0 \
libgnunetdatastore1 \
libgnunetdht4 \
libgnunetdid0 \
libgnunetdns0 \
libgnunetfs2 \
libgnunetgns0 \
libgnunetgnsrecord0 \
libgnunetgnsrecordjson0 \
libgnunethello0 \
libgnunetidentity1 \
libgnunetjson3 \
libgnunetmessenger0 \
libgnunetmhd0 \
libgnunetnamecache0 \
libgnunetnamestore0 \
libgnunetnat2 \
libgnunetnatauto0 \
libgnunetnatnew2 \
libgnunetnse0 \
libgnunetpeerstore0 \
libgnunetpils0 \
libgnunetpq5 \
libgnunetreclaim0 \
libgnunetregex3 \
libgnunetregexblock1 \
libgnunetrest0 \
libgnunetrevocation0 \
libgnunetrps0 \
libgnunetscalarproduct0 \
libgnunetsecretsharing0 \
libgnunetset0 \
libgnunetseti0 \
libgnunetsetu0 \
libgnunetsq0 \
libgnunetstatistics2 \
libgnunettestbed0 \
libgnunettesting3 \
libgnunettestingarm0 \
libgnunettestingcore0 \
libgnunettestingtestbed0 \
libgnunettestingtransport0 \
libgnunettransportapplication0 \
libgnunettransportcommunicator0 \
libgnunettransportcore0 \
libgnunettransportmonitor0 \
libgnunetutil20 \
libgnunetvpn0 \
libnss-gns2 \
libnss-gns4-2 \
libnss-gns6-2 \
pkgconfig-gnunetcadet \
pkgconfig-gnunetdatacache \
pkgconfig-gnunetdatastore \
pkgconfig-gnunetgns \
pkgconfig-gnunetgnsrecord \
pkgconfig-gnunethello \
pkgconfig-gnunetidentity \
pkgconfig-gnunetnamestore \
pkgconfig-gnunetnse \
pkgconfig-gnunetstatistics \
pkgconfig-gnunetutil \
pkgconfig-jansson \
pkgconfig-libcurl \
pkgconfig-libextractor \
pkgconfig-libgcrypt \
pkgconfig-libidn2 \
pkgconfig-libmicrohttpd \
pkgconfig-libsodium \
pkgconfig-sqlite3 \
pkgconfig-zlib"

inherit rpm
