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

RPM_NAME = "python314-xsge_tiled-2.0-2.5.noarch.rpm"
RPM_HASH = "ca1c88fd582dd353af72d2171f76f32df36fb37702d9691677395d06ace76dee4a1eb5592da3dd7b2bb38a536485b6b1cae9dcbaaae6941a6a843459ec4d9dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xsge-tiled \
python314-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python314-sge-pygame \
python314-xsge-path"

inherit rpm
