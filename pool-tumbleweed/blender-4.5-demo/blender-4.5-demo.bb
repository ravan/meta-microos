SUMMARY = "Some Blender demo files"
DESCRIPTION = "Some Blender demo scenes \
 \
geeko_example_scene: showing raytracing, rigging, animation, curves, \
                     shading, texturing, vertex groups and rendering."
LICENSE = "CC-BY-4.0"

PV = "4.5.13"

RPM_NAME = "blender-4.5-demo-4.5.13-1.2.noarch.rpm"
RPM_HASH = "f7327d136257eff1a7051dcbe2c6b20c7893c7d8d737a518343ab332fa82881289718bdda42ebcf43438b7e2284f1e0b28362fe2105832f7d724b7914f0ac97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-4.5-demo"

RDEPENDS:${PN} += ""

inherit rpm
