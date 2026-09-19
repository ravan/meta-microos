SUMMARY = "Ogre Runtime Shader System"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This component is used to generate shaders on the fly, based on object material \
properties, scene setup and other user definitions. \
 \
* Runtime shader generation synchronized with scene state. Each time scene \
  settings change, a new set of shaders is generated. \
* Full FFP (Fixed Function Pipeline) emulation. This feature is most useful \
  combined with render system that does not provide any FFP functionality \
  (OpenGL ES 2.0, D3D10, D3D11, etc.). \
* Shader language independent interface: the logic representation of the shader \
  programs is completely independent from the target shader language. \
* Pluggable interface allows extending the target shader languages set and \
  adding new shader-based effects to the system in a seamless way. Each effect \
  code will be automatically combined with the rest of the shader code. \
* Automatic vertex shader compacting mechanism: no more compacting variables by \
  hand. In case the amount of used vertex shader output registers exceeds the \
  maximum allowed (12 to 32, depending on D3DPSHADERCAPS2_0.NumTemps(external \
  link)), a compacting algorithm packs the vertex shader outputs and adds \
  unpack code in the fragment shader side. \
* Material script support, for both export and import."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreRTShaderSystem13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "4b93e2fd0fd00e09ff4b9853e4048327cdaeb2a3828d3248555c39a55803b8da6cdf2a1e206eb422f8cd8d143ce904dcd3612c53809a011053c56e80a0565083"

RPROVIDES:${PN} += "libOgreRTShaderSystem.so.13.6 \
libOgreRTShaderSystem13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
