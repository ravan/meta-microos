SUMMARY = "En-/decode OpenTTD sound replacement files"
DESCRIPTION = "catcodec decodes and encodes sample catalogues for OpenTTD. These sample \
catalogues are not much more than some meta-data (description and file name) \
and raw PCM data. \
 \
catcodec is licensed under the GNU General Public License version 2.0. For \
more information, see the file 'COPYING'."
LICENSE = "GPL-2.0"

PV = "1.0.5"

RPM_NAME = "catcodec-1.0.5-7.35.aarch64.rpm"
RPM_HASH = "7f4d3a9e7dc43fbc82eb23f0c30972aee77044d988be0f928faa1658c768521076e6d1bcd5c2aa244140caf503446deaeb46a9e872c3486f2004d27a5ede190f"

RPROVIDES:${PN} += "catcodec"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
