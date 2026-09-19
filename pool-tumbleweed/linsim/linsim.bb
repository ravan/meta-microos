SUMMARY = "Amateur Radio Digital Mode evaluation under varying HF propagation conditions"
DESCRIPTION = "Linsim is designed to read and then add path simulation to any monophonic wav \
file recorded at any sampling rate. It works particularly well with files that \
were created using fldigi’s audio capture and audio generate functions. The \
entire wav file will be saved to computer memory and then duplicated during the \
signal processing. The user should try to keep the length of the wav file at 20 \
Mg or less, but the author has tested some 200 Mg files on both Linux and \
Windows-8 without causing a program fault. These files were original VOAR \
broadcasts of about 30 minutes duration. The objective of this type of \
simulation is to finally measure the character error rate (CER) and bit error \
rate (BER) of a specific modem type and decoder design. For most modems a \
sequence of 1000 characters provides a sufficient level of confidence in the \
CER measurment. \
 \
Simulations include path delay, doppler, frequency shift and band limited \
Gaussian white noise. All simulations are constrained to a 3000 Hz bandwidth. \
The input signal is filtered by a FIR bandpass filter (400 - 3400 Hz)."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.6"

RPM_NAME = "linsim-2.0.6-1.8.aarch64.rpm"
RPM_HASH = "bdf7e4bc694f7fe0ae5cdf8a7c7e39b46005801f1f8cf9ec9c6164e9b913d89c604386f40dab0ab2602b76a77cf9c7298270d7f0fa2d67420c74f6619cb5bcb3"

RPROVIDES:${PN} += "linsim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
