SUMMARY = "Libraries used by XRootD servers"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by XRootD servers."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-server-libs-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "80c8baa111898693e9cc955bfe5a1a136999e83fd32d1a5c6b2f58073e3db6d247ea9246a2d1f551f50c875af054f2eb332aee43494c427ab915ace993c7c239"

RPROVIDES:${PN} += "libXrdBlacklistDecision-5.so \
libXrdBwm-5.so \
libXrdClRecorder-5.so \
libXrdHttp-5.so \
libXrdN2No2p-5.so \
libXrdOfsPrepGPI-5.so \
libXrdOssCsi-5.so \
libXrdOssSIgpfsT-5.so \
libXrdOssStats-5.so \
libXrdPfc-5.so \
libXrdPfcPurgeQuota-5.so \
libXrdPss-5.so \
libXrdServer.so.3 \
libXrdSsi-5.so \
libXrdSsiLib.so.2 \
libXrdSsiLog-5.so \
libXrdSsiShMap.so.2 \
libXrdThrottle-5.so \
libXrdXrootd-5.so \
xrootd-server-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libXrdCl.so.3 \
libXrdHttpUtils.so.2 \
libXrdPosix.so.3 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
logrotate \
systemd \
xrootd-client-libs \
xrootd-libs"

inherit rpm
