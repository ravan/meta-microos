SUMMARY = "Easy scan to PDF"
DESCRIPTION = "A GUI to ease the process of producing a multipage PDF from a scan. \
 \
Features: \
 * Compatible with any SANE-capable scanner \
 * Crop, threshold & clean up scan \
 * Reorder pages via DND \
 * Write multi-page scan to PDF, DjVu or TIFF \
 * Write single scans to any format supported by ImageMagick \
 * Ocropus & tesseract support \
 * Place OCR output at boundary boxes supplied by Ocropus \
 * Incorporate PDF metadata in filename"
LICENSE = "GPL-3.0-only"

PV = "2.13.5"

RPM_NAME = "gscan2pdf-2.13.5-2.5.noarch.rpm"
RPM_HASH = "f887d758461ef04f4b461cb6a811227fb91893394075d45c46e1203cd3ce4a554c4986ec105be1a5c13696eea162e5bd80958b0d789471181262673c3274f62f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gscan2pdf \
perl-Gscan2pdf--Bboxtree \
perl-Gscan2pdf--Canvas \
perl-Gscan2pdf--Canvas--Bbox \
perl-Gscan2pdf--Canvas--ListIter \
perl-Gscan2pdf--Canvas--TreeIter \
perl-Gscan2pdf--ComboBoxText \
perl-Gscan2pdf--Config \
perl-Gscan2pdf--Cuneiform \
perl-Gscan2pdf--Dialog \
perl-Gscan2pdf--Dialog--MultipleMessage \
perl-Gscan2pdf--Dialog--Renumber \
perl-Gscan2pdf--Dialog--Save \
perl-Gscan2pdf--Dialog--Scan \
perl-Gscan2pdf--Dialog--Scan--CLI \
perl-Gscan2pdf--Dialog--Scan--Image-Sane \
perl-Gscan2pdf--Document \
perl-Gscan2pdf--EntryCompletion \
perl-Gscan2pdf--Frontend--CLI \
perl-Gscan2pdf--Frontend--Image-Sane \
perl-Gscan2pdf--Helpers \
perl-Gscan2pdf--NetPBM \
perl-Gscan2pdf--Page \
perl-Gscan2pdf--PageRange \
perl-Gscan2pdf--Scanner--Options \
perl-Gscan2pdf--Scanner--Profile \
perl-Gscan2pdf--Tesseract \
perl-Gscan2pdf--Translation \
perl-Gscan2pdf--Unpaper"

RDEPENDS:${PN} += "/usr/bin/perl \
djvulibre \
pdftk \
perl--MODULE-COMPAT-5.44.0 \
perl-Config--General \
perl-Data--UUID \
perl-Date--Calc \
perl-Exception--Class \
perl-Filesys--Df \
perl-Glib \
perl-GooCanvas2 \
perl-Gtk3 \
perl-Gtk3--ImageView \
perl-Gtk3--SimpleList \
perl-Image--Magick \
perl-Image--Sane \
perl-List--MoreUtils \
perl-Locale--Language \
perl-Locale--gettext \
perl-Log--Log4perl \
perl-PDF--Builder \
perl-Proc--ProcessTable \
perl-Readonly \
perl-Set--IntSpan \
perl-Try--Tiny \
perl-base \
tiff \
typelib-GdkPixdata \
typelib-GooCanvas \
unpaper"

inherit rpm
