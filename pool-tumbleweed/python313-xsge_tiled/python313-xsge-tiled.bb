SUMMARY = "xSGE Tiled Library"
DESCRIPTION = "xSGE is a collection of extensions for the SGE licensed under the GNU \
General Public License.  They are designed to give additional features \
to free/libre software games which aren't necessary, but are nice to \
have. \
 \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides support for loading the JSON format of the \
Tiled Map Editor. This allows you to use Tiled to edit your game’s world \
(e.g. levels), rather than building a level editor yourself."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "python313-xsge_tiled-2.0-2.5.noarch.rpm"
RPM_HASH = "12f1b056231d784a6f9cafa66af6dc7ef104ca25629013acb183a38a5526d2fc0b381e86a2890efdcf0269956751ec65c7f4c87693ed9526b646249143040fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-tiled \
python3.13dist-xsge-tiled \
python313-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python313-sge-pygame \
python313-xsge-path"

inherit rpm
