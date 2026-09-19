SUMMARY = "Widget for pulseaudio"
DESCRIPTION = "Displays volume and mute status and controls for PulseAudio devices. \
Use wheel up and down to change volume, left click mutes, right click opens pavucontrol."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-pulseaudio-2.1.5-4.7.noarch.rpm"
RPM_HASH = "92fdd57924da83025d9c8fb730402dcca78bfb2fcbc0d98efd4e404adfe05c4be575d7cea625e6da59cf66c23817c3bcc9aa4f7ebc7851cc1077ae1aa0e326f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-pulseaudio"

RDEPENDS:${PN} += "bumblebee-status \
pavucontrol \
pulseaudio-utils"

inherit rpm
