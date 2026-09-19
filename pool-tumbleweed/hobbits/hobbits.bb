SUMMARY = "A GUI for bit-based analysis, processing, and visualization"
DESCRIPTION = "A GUI for bit-based analysis, processing, and visualization."
LICENSE = "MIT"

PV = "0.55.0"

RPM_NAME = "hobbits-0.55.0-1.3.aarch64.rpm"
RPM_HASH = "e18f50a9d221b6343959db392d259c581f21719b473c16aaa530e0d643a820c8a559f54e4e11f9e5f73e7b73d26070bb03c952f391d8a63adb1685be9ede1a22"

RPROVIDES:${PN} += "bundled-pffft \
hobbits \
libhobbits-core.so \
libhobbits-plugin-analyzers-Find.so \
libhobbits-plugin-analyzers-Highlight.so \
libhobbits-plugin-analyzers-KaitaiStruct.so \
libhobbits-plugin-analyzers-Metadata.so \
libhobbits-plugin-analyzers-WidthFramer.so \
libhobbits-plugin-displays-AsciiView.so \
libhobbits-plugin-displays-BinaryView.so \
libhobbits-plugin-displays-BitRaster.so \
libhobbits-plugin-displays-ByteRaster.so \
libhobbits-plugin-displays-DigraphPlot.so \
libhobbits-plugin-displays-DotPlot.so \
libhobbits-plugin-displays-FrequencyPlot.so \
libhobbits-plugin-displays-HexView.so \
libhobbits-plugin-displays-HilbertPlot.so \
libhobbits-plugin-displays-Spectrogram.so \
libhobbits-plugin-displays-SymbolRaster.so \
libhobbits-plugin-importerexporters-BitContainerData.so \
libhobbits-plugin-importerexporters-DisplayPrint.so \
libhobbits-plugin-importerexporters-FileData.so \
libhobbits-plugin-importerexporters-HexString.so \
libhobbits-plugin-importerexporters-HttpData.so \
libhobbits-plugin-importerexporters-PacketCapture.so \
libhobbits-plugin-importerexporters-PrbsGenerator.so \
libhobbits-plugin-importerexporters-TcpData.so \
libhobbits-plugin-importerexporters-UdpData.so \
libhobbits-plugin-importerexporters-UsbDevice.so \
libhobbits-plugin-operators-BitsError.so \
libhobbits-plugin-operators-Edit.so \
libhobbits-plugin-operators-Extractor.so \
libhobbits-plugin-operators-HeaderFramer.so \
libhobbits-plugin-operators-PythonRunner.so \
libhobbits-plugin-operators-QamRemapper.so \
libhobbits-plugin-operators-TakeSkipOperator.so \
libhobbits-python.so \
libhobbits-widgets.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
