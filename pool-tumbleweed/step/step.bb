SUMMARY = "An interactive physics simulator"
DESCRIPTION = "Step is an interactive physical simulator. The user first places some \
bodies on the scene, add some forces such as gravity or springs. When \
the simulation is run, Step shows how the scene will evolve according \
to the laws of physics. Every property of bodies/forces in the \
experiment may be changed, even during simulation."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "step-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7d3c6dd2f77edd87448230618d4a367e08f427ed314e048b8ae5e6ef9b440c491d15e8f989dc9146e1d4ad37a8a34ce7ae1ca147e8877f2804c13dfb34645154"

RPROVIDES:${PN} += "step \
step5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Plotting.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgsl.so.28 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
