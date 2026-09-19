SUMMARY = "A multitrack tablature editor and player written in Java-SWT"
DESCRIPTION = "TuxGuitar is a guitar tablature editor with player support through midi. It can \
display scores and multitrack tabs. Various features TuxGuitar provides include \
autoscrolling while playing, note duration management, bend/slide/vibrato/ \
hammer-on/pull-off effects, support for tuplets, time signature management, \
tempo management, gp3/gp4/gp5/gpx import and export."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.0"

RPM_NAME = "tuxguitar-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "658049f8966ee5342e850cf97828e78ad3027e4df643229431b3afd8b494f1c651c6a0266c443f81ceb3fec87d9d39116445fe8ec933503564fea321e3324717"

RPROVIDES:${PN} += "libtuxguitar-alsa-jni.so \
libtuxguitar-fluidsynth-jni.so \
libtuxguitar-jack-jni.so \
libtuxguitar-synth-lv2-jni.so \
mvn-app.tuxguitar-tuxguitar \
mvn-app.tuxguitar-tuxguitar-alsa \
mvn-app.tuxguitar-tuxguitar-alsa-linux-pom- \
mvn-app.tuxguitar-tuxguitar-alsa-pom- \
mvn-app.tuxguitar-tuxguitar-ascii \
mvn-app.tuxguitar-tuxguitar-ascii-pom- \
mvn-app.tuxguitar-tuxguitar-awt-graphics \
mvn-app.tuxguitar-tuxguitar-awt-graphics-pom- \
mvn-app.tuxguitar-tuxguitar-browser-ftp \
mvn-app.tuxguitar-tuxguitar-browser-ftp-pom- \
mvn-app.tuxguitar-tuxguitar-compat \
mvn-app.tuxguitar-tuxguitar-compat-pom- \
mvn-app.tuxguitar-tuxguitar-converter \
mvn-app.tuxguitar-tuxguitar-converter-pom- \
mvn-app.tuxguitar-tuxguitar-debug-helper \
mvn-app.tuxguitar-tuxguitar-debug-helper-pom- \
mvn-app.tuxguitar-tuxguitar-editor-utils \
mvn-app.tuxguitar-tuxguitar-editor-utils-pom- \
mvn-app.tuxguitar-tuxguitar-fluidsynth \
mvn-app.tuxguitar-tuxguitar-fluidsynth-linux-pom- \
mvn-app.tuxguitar-tuxguitar-fluidsynth-pom- \
mvn-app.tuxguitar-tuxguitar-gm-settings \
mvn-app.tuxguitar-tuxguitar-gm-settings-pom- \
mvn-app.tuxguitar-tuxguitar-gm-utils \
mvn-app.tuxguitar-tuxguitar-gm-utils-pom- \
mvn-app.tuxguitar-tuxguitar-gpx \
mvn-app.tuxguitar-tuxguitar-gpx-pom- \
mvn-app.tuxguitar-tuxguitar-gtp \
mvn-app.tuxguitar-tuxguitar-gtp-pom- \
mvn-app.tuxguitar-tuxguitar-gtp-ui \
mvn-app.tuxguitar-tuxguitar-gtp-ui-pom- \
mvn-app.tuxguitar-tuxguitar-image-swt \
mvn-app.tuxguitar-tuxguitar-image-swt-pom- \
mvn-app.tuxguitar-tuxguitar-jack \
mvn-app.tuxguitar-tuxguitar-jack-linux-pom- \
mvn-app.tuxguitar-tuxguitar-jack-pom- \
mvn-app.tuxguitar-tuxguitar-jack-ui \
mvn-app.tuxguitar-tuxguitar-jack-ui-pom- \
mvn-app.tuxguitar-tuxguitar-jsa \
mvn-app.tuxguitar-tuxguitar-jsa-pom- \
mvn-app.tuxguitar-tuxguitar-lib \
mvn-app.tuxguitar-tuxguitar-lib-pom- \
mvn-app.tuxguitar-tuxguitar-lilypond \
mvn-app.tuxguitar-tuxguitar-lilypond-pom- \
mvn-app.tuxguitar-tuxguitar-lilypond-ui \
mvn-app.tuxguitar-tuxguitar-lilypond-ui-pom- \
mvn-app.tuxguitar-tuxguitar-linux-swt-pom- \
mvn-app.tuxguitar-tuxguitar-midi \
mvn-app.tuxguitar-tuxguitar-midi-pom- \
mvn-app.tuxguitar-tuxguitar-midi-ui \
mvn-app.tuxguitar-tuxguitar-midi-ui-pom- \
mvn-app.tuxguitar-tuxguitar-musicxml \
mvn-app.tuxguitar-tuxguitar-musicxml-pom- \
mvn-app.tuxguitar-tuxguitar-pdf \
mvn-app.tuxguitar-tuxguitar-pdf-pom- \
mvn-app.tuxguitar-tuxguitar-pdf-ui \
mvn-app.tuxguitar-tuxguitar-pdf-ui-pom- \
mvn-app.tuxguitar-tuxguitar-pom- \
mvn-app.tuxguitar-tuxguitar-ptb \
mvn-app.tuxguitar-tuxguitar-ptb-pom- \
mvn-app.tuxguitar-tuxguitar-svg \
mvn-app.tuxguitar-tuxguitar-svg-pom- \
mvn-app.tuxguitar-tuxguitar-synth \
mvn-app.tuxguitar-tuxguitar-synth-export \
mvn-app.tuxguitar-tuxguitar-synth-export-pom- \
mvn-app.tuxguitar-tuxguitar-synth-gervill \
mvn-app.tuxguitar-tuxguitar-synth-gervill-pom- \
mvn-app.tuxguitar-tuxguitar-synth-lv2 \
mvn-app.tuxguitar-tuxguitar-synth-lv2-linux-pom- \
mvn-app.tuxguitar-tuxguitar-synth-lv2-pom- \
mvn-app.tuxguitar-tuxguitar-synth-pom- \
mvn-app.tuxguitar-tuxguitar-tef \
mvn-app.tuxguitar-tuxguitar-tef-pom- \
mvn-app.tuxguitar-tuxguitar-tray-swt \
mvn-app.tuxguitar-tuxguitar-tray-swt-pom- \
mvn-app.tuxguitar-tuxguitar-tuner \
mvn-app.tuxguitar-tuxguitar-tuner-pom- \
mvn-app.tuxguitar-tuxguitar-ui-toolkit \
mvn-app.tuxguitar-tuxguitar-ui-toolkit-pom- \
mvn-app.tuxguitar-tuxguitar-ui-toolkit-swt \
mvn-app.tuxguitar-tuxguitar-ui-toolkit-swt-pom- \
mvn-media.sound-gervill \
mvn-media.sound-gervill-pom- \
tuxguitar"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-compress \
eclipse-swt \
fluid-soundfont-gm \
java-headless \
javapackages-filesystem \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libjack.so.0 \
liblilv-0.so.0 \
mvn-com.itextpdf-itextpdf \
mvn-com.itextpdf.tool-xmlworker \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-compress"

inherit rpm
