SUMMARY = "XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains libraries used by the XRootD servers and \
clients."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-libs-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "e95338415e1b670e1f8722ab3652d680f24e62526c063229fa0a3b932d353513608a0efbc6f6f7cadab41b65531d3416ce4a871c860386b87add2c04678ef589"

RPROVIDES:${PN} += "libXrdAccSciTokens-5.so \
libXrdAppUtils.so.2 \
libXrdCksCalczcrc32-5.so \
libXrdClHttp-5.so \
libXrdClProxyPlugin-5.so \
libXrdCmsRedirectLocal-5.so \
libXrdCrypto.so.2 \
libXrdCryptoLite.so.2 \
libXrdCryptossl-5.so \
libXrdHttpCors-5.so \
libXrdHttpTPC-5.so \
libXrdHttpUtils.so.2 \
libXrdSec-5.so \
libXrdSecProt-5.so \
libXrdSecgsi-5.so \
libXrdSecgsiAUTHZVO-5.so \
libXrdSecgsiGMAPDN-5.so \
libXrdSeckrb5-5.so \
libXrdSecpwd-5.so \
libXrdSecsss-5.so \
libXrdSecunix-5.so \
libXrdSecztn-5.so \
libXrdUtils.so.3 \
libXrdXml.so.3 \
xrootd-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSciTokens.so.0 \
libXrdCl.so.3 \
libXrdServer.so.3 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libcurl.so.4 \
libdavix.so.0 \
libgcc-s.so.1 \
libkrb5.so.3 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
