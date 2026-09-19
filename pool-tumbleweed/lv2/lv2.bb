SUMMARY = "Plugin standard for audio systems"
DESCRIPTION = "LV2 is a portable plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a simple core (roughly \
equivalent in power to LADSPA) which can be extended to support more advanced \
functionality. This allows the interface to be 'grown' to accommodate the needs \
of real software as they arise. \
 \
LV2 is both a stable interface and a forward-moving project: there is a stable \
set of 'official' extensions in use while new functionality is actively \
developed. Anyone can extend LV2, which allows developers to try out new ideas \
and ensure they work in practice. Good extensions are vetted by the community \
and included in the official distribution so they can be relied on to be widely \
supported. This open development model means developers can always scratch their \
itch without a central authority getting in the way. The current stable release \
includes most functionality required by modern plugins, including: \
 \
  * Audio, control, 'control voltage' (audio-rate control), and event \
    (e.g. MIDI) input and output \
  * Expressive open-ended port metadata, including: \
    - 'Meaningful' controls (e.g. gain or envelope attack) allowing intelligent \
      host control or UI generation \
    - Control units (e.g. Hz, octaves, dB) \
    - Multi-channel port groups (e.g. stereo, 5.1 surround, ambisonics \
  * Embeddable GUIs in any toolkit, with support for a full plugin/UI split \
    (including network transparency in capable hosts) \
  * Ability to bundle any files (e.g. samples or impulses) with plugins \
  * Presets (bundled and/or user saved) \
  * Plugin state saving and restoring \
  * Host-managed logging \
  * Non-realtime plugin worker methods (simple and portable host-managed \
    threading) \
  * Message-based plugin communication, allowing plugins/UIs to have advanced \
    interfaces without host support or specifications getting in the way \
  * Transport awareness, both real time and tempo time (bars, beats, etc-.) \
 \
LV2 has graceful compatibility 'baked in': for example, a simple amplifier \
plugin might have audio in/out with a gain control, and function in any host. \
The same plugin could have a fancy GUI and transport awareness which optionally \
work in hosts that support these features. Conversely, hosts know not to load \
plugins that require features it does not support. \
 \
See the specification index for complete documentation. If you are a host or \
plugin author and need missing functionality, please file a ticket or let us \
know your requirements on  the mailing list. LV2 is a community project that \
depends on your feedback to improve - unknown requirements are unmet \
requirements!"
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-1.18.10-3.11.aarch64.rpm"
RPM_HASH = "745da96fb133eefeb90da808af7864d1958b899b57135d74146e13a255e2f6709e2881de824587bd4b561756517451faeb73d9c39f180f2d941b57900e3fb140"

RPROVIDES:${PN} += "lv2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
