SUMMARY = "Some Blender demo files"
DESCRIPTION = "Some Blender demo scenes \
 \
geeko_example_scene: showing raytracing, rigging, animation, curves, \
                     shading, texturing, vertex groups and rendering."
LICENSE = "CC-BY-4.0"

PV = "5.0.1"

RPM_NAME = "blender-5.0-demo-5.0.1-6.2.noarch.rpm"
RPM_HASH = "6f3a7671287915de1c0f9561f5c1989325c00b31485083ca26c4c6e268f2e072e95c60c57ce78b176819621e902c8e722b6d1067cbfccea1dba162202bdc75c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blender-5.0-demo"

RDEPENDS:${PN} += ""

inherit rpm
