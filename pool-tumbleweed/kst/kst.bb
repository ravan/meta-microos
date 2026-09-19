SUMMARY = "Real-Time Data Viewing and Plotting Tool with Basic Data Analysis Functionality"
DESCRIPTION = "Kst is a data plotting and viewing program. Some of the features include: \
- Robust plotting of live 'streaming' data \
- Powerful keyboard and mouse plot manipulation \
- Powerful plug-in and extension support \
- Large selection of built-in plotting and data manipulation functions, \
  such as histograms, equations, and power spectra \
- Color mapping and contour mapping capabilities for three-dimensional data \
- Monitoring of events and notification support \
- Built-in filtering and curve fitting capabilities \
- Convenient command line interface \
- Powerful graphical user interface"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "kst-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "bf00ed530ef05ee251e5d1c81aeeb5911fc464b6df7ca16d6031578206916d9205cf6326cff5afbc33e7562d31eed0d80209ef9eaabbb6cfc8c1dab4aac9e7fb"

RPROVIDES:${PN} += "kst \
libKst6Core.so \
libKst6Math.so \
libKst6Widgets.so \
libdataobject-activitylevel.so \
libdataobject-bin.so \
libdataobject-chop.so \
libdataobject-convolution-convolve.so \
libdataobject-convolution-deconvolve.so \
libdataobject-correlation-autocorrelation.so \
libdataobject-correlation-crosscorrelation.so \
libdataobject-crossspectrum.so \
libdataobject-effectivebandwidth.so \
libdataobject-genericfilter.so \
libdataobject-interpolations-akima.so \
libdataobject-interpolations-akimaperiodic.so \
libdataobject-interpolations-cspline.so \
libdataobject-interpolations-csplineperiodic.so \
libdataobject-interpolations-linear.so \
libdataobject-interpolations-polynomial.so \
libdataobject-linefit.so \
libdataobject-lockin.so \
libdataobject-noiseaddition.so \
libdataobject-periodogram.so \
libdataobject-phase.so \
libdataobject-shift.so \
libdataobject-statistics.so \
libdataobject-syncbin.so \
libdatasource-ascii.so \
libdatasource-fitsimage.so \
libdatasource-hdf5.so \
libdatasource-matlab.so \
libdatasource-netcdf.so \
libdatasource-qimagesource.so \
libdatasource-sourcelist.so \
libdatasource-tiff16source.so \
libfilters-boxcar.so \
libfilters-butterworth-bandpass.so \
libfilters-butterworth-bandstop.so \
libfilters-butterworth-highpass.so \
libfilters-butterworth-lowpass.so \
libfilters-cumulativeaverage.so \
libfilters-cumulativesum.so \
libfilters-despike.so \
libfilters-differentiation.so \
libfilters-exponential.so \
libfilters-flag.so \
libfilters-hpboxcar.so \
libfilters-movingaverage.so \
libfilters-movingmedian.so \
libfilters-unwind.so \
libfilters-window.so \
libfits-exponential-unweighted.so \
libfits-exponential-weighted.so \
libfits-gaussian-unweighted.so \
libfits-gaussian-weighted.so \
libfits-gradient-unweighted.so \
libfits-gradient-weighted.so \
libfits-kneefrequency.so \
libfits-linear-unweighted.so \
libfits-linear-weighted.so \
libfits-lorentzian-unweighted.so \
libfits-lorentzian-weighted.so \
libfits-polynomial-unweighted.so \
libfits-polynomial-weighted.so \
libfits-sinusoid-unweighted.so \
libfits-sinusoid-weighted.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5-cpp.so.310 \
libhdf5.so.310 \
libm.so.6 \
libmatio.so.14 \
libnetcdf-c++4.so.1 \
libnetcdf.so.22 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
