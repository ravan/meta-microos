SUMMARY = "A Free Office Suite (Framework)"
DESCRIPTION = "LibreOffice is a comprehensive office package featuring a word \
processor, a spreadsheet, a presentation program, and much more. This \
package provides only the basic framework. You have to install the \
additional modules to get the required functionality, see packages: \
 \
- libreoffice-base \
- libreoffice-calc \
- libreoffice-draw \
- libreoffice-impress \
- libreoffice-math \
- libreoffice-writer \
 \
Some optional features are provided by extra packages, for example: \
 \
- libreoffice-mailmerge \
- libreoffice-filters \
- libreoffice-qt5 \
- libreoffice-qt6 \
- libreoffice-gnome \
 \
Non-English localizations are provided by extra packages as well, for \
example: \
 \
- libreoffice-l10n-de \
- libreoffice-l10n-fr \
- libreoffice-l10n-it"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "51ccbd3c8bf85d9c7a8d7068fe86ed5b3e5111a4eb082fc4a384ea4e2d63808dec663bdd173e2b4a7a789e85da3971fab4d9dfb9292c14b59525aa0bc370d942"

RPROVIDES:${PN} += "bundled-hsqldb \
config-libreoffice \
libLanguageToollo.so \
libaffine-uno-uno.so \
libanimcorelo.so \
libavmediagst.so \
libavmediaqt6.so \
libbiblo.so \
libbinaryurplo.so \
libbootstraplo.so \
libcached1.so \
libcairocanvaslo.so \
libclewlo.so \
libcmdmaillo.so \
libcuilo.so \
libdbahsqllo.so \
libdbalo.so \
libdbaselo.so \
libdbaxmllo.so \
libdbpool2.so \
libdeploymentgui.so \
libdlgprovlo.so \
libfilelo.so \
libflatlo.so \
libgcc3-uno.so \
libgraphicfilterlo.so \
libhsqldb.so \
libi18nlangtag.so \
libintrospectionlo.so \
libinvocadaptlo.so \
libinvocationlo.so \
libiolo.so \
libjava-uno.so \
libjavaloaderlo.so \
libjavavmlo.so \
libjdbclo.so \
libjpipe.so \
libjuh.so \
libjuhx.so \
libjvmaccesslo.so \
libjvmfwklo.so \
libldapbe2lo.so \
liblibreofficekitgtk.so \
liblocaledata-en.so \
liblocaledata-es.so \
liblocaledata-euro.so \
liblocaledata-others.so \
liblog-uno-uno.so \
libloglo.so \
libmergedlo.so \
libmigrationoo2lo.so \
libmigrationoo3lo.so \
libmozbootstraplo.so \
libmsformslo.so \
libmysql-jdbclo.so \
libnamingservicelo.so \
libodbclo.so \
libpcrlo.so \
libpdffilterlo.so \
libpdfiumlo.so \
libprotocolhandlerlo.so \
libproxyfaclo.so \
libreflectionlo.so \
libreglo.so \
libreoffice \
libreoffice-base-extensions \
libreoffice-draw-extensions \
libreoffice-icon-theme-crystal \
libreoffice-icon-theme-oxygen \
libreoffice-impress-extensions \
libreoffice-kde \
libreoffice-kde4 \
libreoffice-l10n-prebuild \
libreoffice-mono \
libreoffice-qt5 \
libreoffice-ure \
libsal-textenclo.so \
libscnlo.so \
libscriptframe.so \
libsdbc2.so \
libsdbtlo.so \
libsddlo.so \
libsdlo.so \
libsduilo.so \
libsingleprovlo.so \
libskialo.so \
libslideshowlo.so \
libstocserviceslo.so \
libstoragefdlo.so \
libstorelo.so \
libsvgfilterlo.so \
libswlo.so \
libtextconversiondlgslo.so \
libucpchelp1.so \
libucpcmis1lo.so \
libucpdav1.so \
libucppkg1.so \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-purpenvhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libunoidllo.so \
libunopkgapp.so \
libunsafe-uno-uno.so \
libuuresolverlo.so \
libvclplug-genlo.so \
libwpftdrawlo.so \
libwriterperfectlo.so \
libxmlreaderlo.so \
libxmlsecurity.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Widgets.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libZXing.so.4 \
libabsl-throw-delegate.so.2608.0.0 \
libargon2.so.1 \
libboost-locale.so.1.91.0 \
libbox2d.so.2 \
libc.so.6 \
libcairo.so.2 \
libcdr-0.1.so.1 \
libclucene-contribs-lib.so.1 \
libclucene-core.so.1 \
libcmis-0.6.so.6 \
libcups.so.2 \
libcurl.so.4 \
libdbus-1.so.3 \
libeot.so.0 \
libepoxy.so.0 \
liberation-fonts \
libexpat.so.1 \
libexslt.so.0 \
libexttextcat-2.0.so.0 \
libfontconfig.so.1 \
libfreehand-0.1.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgmepp.so.7 \
libgraphite2.so.3 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libharfbuzz-icu.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libhunspell-1.7.so.0 \
libhyphen.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
liblangtag.so.1 \
liblcms2.so.2 \
libldap.so.2 \
libm.so.6 \
libmd4c.so.0 \
libmspub-0.1.so.1 \
libmwaw-0.3.so.3 \
libmythes-1.2.so.0 \
libnspr4.so \
libnss3.so \
libnumbertext-1.0.so.0 \
libodfgen-0.1.so.1 \
libopenjp2.so.7 \
liborcus-0.21.so.0 \
liborcus-parser-0.21.so.0 \
libpagemaker-0.0.so.0 \
libplc4.so \
libpng16.so.16 \
libqxp-0.0.so.0 \
libraptor2.so.0 \
librdf.so.0 \
libreoffice-branding \
libreoffice-icon-themes \
libreoffice-l10n-en \
librevenge-0.0.so.0 \
libsmime3.so \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libtiff.so.6 \
libvisio-0.1.so.1 \
libwebp.so.7 \
libwpg-0.3.so.3 \
libxml2.so.16 \
libxmlsec1-nss.so.1 \
libxmlsec1.so.1 \
libxslt.so.1 \
libz.so.1 \
libzmf-0.0.so.0 \
libzstd.so.1 \
libzxcvbn.so.0 \
python3 \
rtld-GNU-HASH"

inherit rpm
