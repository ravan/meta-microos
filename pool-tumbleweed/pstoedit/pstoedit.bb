SUMMARY = "PostScript and PDF Converter"
DESCRIPTION = "Pstoedit converts PostScript and PDF files to various vector graphic \
formats. The resulting files can be edited or imported into various \
drawing packages. Pstoedit comes with a large set of integrated format \
drivers."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "pstoedit-4.3-1.1.aarch64.rpm"
RPM_HASH = "4b443bd107d1853559c6dbb147fcbf537cb6320fe46da4987b66ff3a400c2927ad2cdb1067a9e36ff5aa878e6befc6649d285aca479acb9e689bdb96c90819bd"

RPROVIDES:${PN} += "libp2edrvlplot.so \
libp2edrvmagick++.so \
libp2edrvpptx.so \
libp2edrvstd.so \
libp2edrvwmf.so \
libpstoedit.so.0 \
pstoedit"

RDEPENDS:${PN} += "/sbin/ldconfig \
ghostscript \
ld-linux-aarch64.so.1 \
libEMF.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplotter.so.2 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
