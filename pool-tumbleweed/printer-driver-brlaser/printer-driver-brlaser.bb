SUMMARY = "Driver for (some) Brother laster printers"
DESCRIPTION = "Most Brother printers support a standard printer language such as \
PCL or PostScript, but not all do. If you have a monochrome Brother \
laser printer (or multi-function device) and the other open source \
drivers don't work, this one might help. \
 \
The following printers have been reported to work with this driver: \
 \
    Brother DCP-1510 series \
    Brother DCP-1600 series \
    Brother DCP-1610W series \
    Brother DCP-7010 \
    Brother DCP-7020 \
    Brother DCP-7030 \
    Brother DCP-7040 \
    Brother DCP-7055 \
    Brother DCP-7055W \
    Brother DCP-7060D \
    Brother DCP-7065DN \
    Brother DCP-7070DW \
    Brother DCP-7080 \
    Brother DCP-7080D \
    Brother DCP-8065DN \
    Brother DCP-B7500D series \
    Brother DCP-L2500D series \
    Brother DCP-L2510D series \
    Brother DCP-L2520D series \
    Brother DCP-L2520DW series \
    Brother DCP-L2537DW \
    Brother DCP-L2540DW series \
    Brother DCP-L2550DW series \
    Brother DCP-L2560DW series \
    Brother FAX-2820 \
    Brother FAX-2840 \
    Brother HL-1110 series \
    Brother HL-1200 series \
    Brother HL-2030 series \
    Brother HL-2130 series \
    Brother HL-2140 series \
    Brother HL-2150N \
    Brother HL-2220 series \
    Brother HL-2230 series \
    Brother HL-2240 series \
    Brother HL-2240D series \
    Brother HL-2250DN series \
    Brother HL-2260 \
    Brother HL-2260D \
    Brother HL-2270DW series \
    Brother HL-2280DW \
    Brother HL-5030 series \
    Brother HL-5040 series \
    Brother HL-5140 series \
    Brother HL-5370DW series \
    Brother HL-5450DN series \
    Brother HL-L2300D series \
    Brother HL-L2305 series \
    Brother HL-L2310D series \
    Brother HL-L2320D series \
    Brother HL-L2335D series \
    Brother HL-L2340D series \
    Brother HL-L2350DW series \
    Brother HL-L2360D series \
    Brother HL-L2370DN series \
    Brother HL-L2375DW series \
    Brother HL-L2380DW series \
    Brother HL-L2390DW \
    Brother HL-L2400DW \
    Brother HL-L2402D \
    Brother HL-L2405W \
    Brother HL-L5000D series \
    Brother MFC-1810 series \
    Brother MFC-1910W series \
    Brother MFC-7240 \
    Brother MFC-7320 \
    Brother MFC-7340 \
    Brother MFC-7360N \
    Brother MFC-7365DN \
    Brother MFC-7420 \
    Brother MFC-7440N \
    Brother MFC-7460DN \
    Brother MFC-7860DW \
    Brother MFC-8440 \
    Brother MFC-8710DW \
    Brother MFC-8860DN \
    Brother MFC-9160 \
    Brother MFC-L2690DW \
    Brother MFC-L2700DN series \
    Brother MFC-L2700DW series \
    Brother MFC-L2710DN series \
    Brother MFC-L2710DW series \
    Brother MFC-L2750DW series \
    Fuji Xerox DocuPrint P265 dw \
    Lenovo LJ2650DN"
LICENSE = "GPL-2.0-or-later"

PV = "6.2.7"

RPM_NAME = "printer-driver-brlaser-6.2.7-1.6.aarch64.rpm"
RPM_HASH = "a23cfda815e2010624d9f05173dbe12f38fc18495942dbd2a1ec9f178e22c613170be0207ac7e919dbcbb763a34fab540c73b9d000fccd915a7ad76c1f117516"

RPROVIDES:${PN} += "postscriptdriver-brother;brlaser-test-driver-duplex; \
postscriptdriver-brother;brlaser-test-driver; \
postscriptdriver-brother;dcp-1510-series; \
postscriptdriver-brother;dcp-1600-series; \
postscriptdriver-brother;dcp-1610w-series; \
postscriptdriver-brother;dcp-7010; \
postscriptdriver-brother;dcp-7020; \
postscriptdriver-brother;dcp-7030; \
postscriptdriver-brother;dcp-7040; \
postscriptdriver-brother;dcp-7055; \
postscriptdriver-brother;dcp-7055w; \
postscriptdriver-brother;dcp-7060d; \
postscriptdriver-brother;dcp-7065dn; \
postscriptdriver-brother;dcp-7070dw; \
postscriptdriver-brother;dcp-7080; \
postscriptdriver-brother;dcp-7080d; \
postscriptdriver-brother;dcp-8065dn; \
postscriptdriver-brother;dcp-b7500d-series; \
postscriptdriver-brother;dcp-l2500d-series; \
postscriptdriver-brother;dcp-l2510d-series; \
postscriptdriver-brother;dcp-l2520d-series; \
postscriptdriver-brother;dcp-l2520dw-series; \
postscriptdriver-brother;dcp-l2537dw; \
postscriptdriver-brother;dcp-l2540dw-series; \
postscriptdriver-brother;dcp-l2550dw-series; \
postscriptdriver-brother;dcp-l2560dw-series; \
postscriptdriver-brother;fax-2820; \
postscriptdriver-brother;fax-2840; \
postscriptdriver-brother;hl-1110-series; \
postscriptdriver-brother;hl-1200-series; \
postscriptdriver-brother;hl-2030-series; \
postscriptdriver-brother;hl-2130-series; \
postscriptdriver-brother;hl-2140-series; \
postscriptdriver-brother;hl-2220-series; \
postscriptdriver-brother;hl-2230-series; \
postscriptdriver-brother;hl-2240-series; \
postscriptdriver-brother;hl-2240d-series; \
postscriptdriver-brother;hl-2250dn-series; \
postscriptdriver-brother;hl-2260; \
postscriptdriver-brother;hl-2260d; \
postscriptdriver-brother;hl-2270dw-series; \
postscriptdriver-brother;hl-2280dw; \
postscriptdriver-brother;hl-5030-series; \
postscriptdriver-brother;hl-5040-series; \
postscriptdriver-brother;hl-5140-series; \
postscriptdriver-brother;hl-5370dw-series; \
postscriptdriver-brother;hl-5450dn-series; \
postscriptdriver-brother;hl-l2300d-series; \
postscriptdriver-brother;hl-l2305-series; \
postscriptdriver-brother;hl-l2310d-series; \
postscriptdriver-brother;hl-l2320d-series; \
postscriptdriver-brother;hl-l2335d-series; \
postscriptdriver-brother;hl-l2340d-series; \
postscriptdriver-brother;hl-l2350dw-series; \
postscriptdriver-brother;hl-l2360d-series; \
postscriptdriver-brother;hl-l2370dn-series; \
postscriptdriver-brother;hl-l2375dw-series; \
postscriptdriver-brother;hl-l2380dw-series; \
postscriptdriver-brother;hl-l2390dw; \
postscriptdriver-brother;hl-l2400dw; \
postscriptdriver-brother;hl-l2402d; \
postscriptdriver-brother;hl-l2405w; \
postscriptdriver-brother;hl-l5000d-series; \
postscriptdriver-brother;mfc-1810-series; \
postscriptdriver-brother;mfc-1910w-series; \
postscriptdriver-brother;mfc-7240; \
postscriptdriver-brother;mfc-7320; \
postscriptdriver-brother;mfc-7340; \
postscriptdriver-brother;mfc-7360n; \
postscriptdriver-brother;mfc-7365dn; \
postscriptdriver-brother;mfc-7420; \
postscriptdriver-brother;mfc-7440n; \
postscriptdriver-brother;mfc-7460dn; \
postscriptdriver-brother;mfc-7860dw; \
postscriptdriver-brother;mfc-8440; \
postscriptdriver-brother;mfc-8710dw; \
postscriptdriver-brother;mfc-8860dn; \
postscriptdriver-brother;mfc-9160; \
postscriptdriver-brother;mfc-l2690dw; \
postscriptdriver-brother;mfc-l2700dn-series; \
postscriptdriver-brother;mfc-l2700dw-series; \
postscriptdriver-brother;mfc-l2710dn-series; \
postscriptdriver-brother;mfc-l2710dw-series; \
postscriptdriver-brother;mfc-l2750dw-series; \
postscriptdriver-fx;docuprint-p265-dw; \
postscriptdriver-lenovo;lj2650dn; \
printer-driver-brlaser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
